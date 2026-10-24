package hg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.km0;
public class b0 extends km0 {
    public final Context f11835c;
    public final int d;
    public final boolean e;
    public final boolean f11836f;
    public final g6 h;

    public b0(int i10, Context context, g6 g6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.f11835c = context;
        this.d = i10;
        this.f11836f = z11;
        this.h = g6Var;
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
        m4 m4Var = (m4) b1Var.f46342a;
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
        m4Var.setTag(Long.valueOf(j10));
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
        m4Var.a(j10, true, str);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        m4 m4Var = new m4(this.f11835c, this.h, z10);
        if (this.f11836f && !m4Var.f22727x) {
            m4Var.f22727x = true;
            NotificationCenter.getInstance(m4Var.h).listen(m4Var, NotificationCenter.userIsPremiumBlockedUpadted, new i2(m4Var, 1));
        }
        m4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new s4.b1(m4Var);
    }
}
