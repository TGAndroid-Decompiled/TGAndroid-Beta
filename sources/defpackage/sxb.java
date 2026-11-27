package defpackage;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.e;
public final class sxb extends d6 {
    public final wxb a;

    public sxb(wxb wxbVar) {
        this.a = wxbVar;
    }

    @Override
    public final void b(int i) {
        int i2;
        vkb vkbVar;
        vkb vkbVar2;
        int i3;
        String obj;
        int i4;
        wxb wxbVar = this.a;
        if (i == -1) {
            wxbVar.finishFragment();
            return;
        }
        String str = null;
        if (i == 1) {
            if (wxbVar.e.getText() == null) {
                obj = null;
            } else {
                obj = wxbVar.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) wxbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                hl.z3(wxbVar.e);
            } else if (!wxbVar.r) {
                id idVar = new id(3, null, wxbVar.getParentActivity());
                idVar.q(500L);
                wxbVar.r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = wxbVar.getMessagesController().j1(wxbVar.a);
                tL_messages_createForumTopic.title = obj;
                long j = wxbVar.b;
                if (j != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
                tL_messages_createForumTopic.icon_color = wxbVar.F;
                tL_messages_createForumTopic.flags |= 1;
                i4 = ((e) wxbVar).currentAccount;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_createForumTopic, new qn8((Object) this, (Object) obj, idVar, (byte) 25));
            }
        } else if (i == 2) {
            if (wxbVar.e.getText() != null) {
                str = wxbVar.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) wxbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                hl.z3(wxbVar.e);
                return;
            }
            if (!wxbVar.x.title.equals(str) || wxbVar.x.icon_emoji_id != wxbVar.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = wxbVar.getMessagesController().j1(wxbVar.a);
                TLRPC.TL_forumTopic tL_forumTopic = wxbVar.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j2 = wxbVar.x.icon_emoji_id;
                long j3 = wxbVar.b;
                if (j2 != j3) {
                    tL_messages_editForumTopic.icon_emoji_id = j3;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i2 = ((e) wxbVar).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editForumTopic, new xe2((byte) 0));
            }
            if (wxbVar.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = wxbVar.x;
                if (tL_forumTopic2.id == 1 && (!vkbVar.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = wxbVar.getMessagesController().j1(wxbVar.a);
                    tL_messages_editForumTopic2.topic_id = wxbVar.x.id;
                    tL_messages_editForumTopic2.hidden = !wxbVar.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i3 = ((e) wxbVar).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_editForumTopic2, new xe2((byte) 0));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = wxbVar.x;
            long j4 = wxbVar.b;
            tL_forumTopic3.icon_emoji_id = j4;
            int i5 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            int i6 = tL_forumTopic3.flags;
            if (i5 != 0) {
                tL_forumTopic3.flags = i6 | 1;
            } else {
                tL_forumTopic3.flags = i6 & (-2);
            }
            tL_forumTopic3.title = str;
            if (wxbVar.d != null) {
                tL_forumTopic3.hidden = !vkbVar2.d.h;
            }
            qyb qybVar = wxbVar.getMessagesController().g4;
            long j5 = wxbVar.a;
            qybVar.getMessagesStorage().c2(j5, wxbVar.x, 35);
            qybVar.y(-j5, true);
            wxbVar.finishFragment();
        }
    }
}
