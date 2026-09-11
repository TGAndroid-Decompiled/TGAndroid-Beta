package hg;

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
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.kl0;
public class c0 extends kl0 {
    public final Context f11004c;
    public final int d;
    public final boolean f11005e;
    public final boolean f11006f;
    public final f6 h;

    public c0(int i10, Context context, f6 f6Var, boolean z10, boolean z11) {
        this.f11005e = z10;
        this.f11004c = context;
        this.d = i10;
        this.f11006f = z11;
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
        m4 m4Var = (m4) c1Var.f45738a;
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
        m4Var.setTag(Long.valueOf(j3));
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
        m4Var.a(j3, str);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.f11005e;
        m4 m4Var = new m4(this.f11004c, this.h, z10);
        if (this.f11006f && !m4Var.f22289x) {
            m4Var.f22289x = true;
            NotificationCenter.getInstance(m4Var.h).listen(m4Var, NotificationCenter.userIsPremiumBlockedUpadted, new i2(m4Var, 1));
        }
        m4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new s4.c1(m4Var);
    }
}
