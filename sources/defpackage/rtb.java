package defpackage;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.d;
public final class rtb extends c6 {
    public final vtb a;

    public rtb(vtb vtbVar) {
        this.a = vtbVar;
    }

    @Override
    public final void b(int i) {
        int i2;
        zgb zgbVar;
        zgb zgbVar2;
        int i3;
        String obj;
        int i4;
        vtb vtbVar = this.a;
        if (i == -1) {
            vtbVar.finishFragment();
            return;
        }
        String str = null;
        if (i == 1) {
            if (vtbVar.e.getText() == null) {
                obj = null;
            } else {
                obj = vtbVar.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) vtbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                gl.z3(vtbVar.e);
            } else if (!vtbVar.r) {
                hd hdVar = new hd(3, null, vtbVar.getParentActivity());
                hdVar.q(500L);
                vtbVar.r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = vtbVar.getMessagesController().h1(vtbVar.a);
                tL_messages_createForumTopic.title = obj;
                long j = vtbVar.b;
                if (j != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
                tL_messages_createForumTopic.icon_color = vtbVar.F;
                tL_messages_createForumTopic.flags |= 1;
                i4 = ((d) vtbVar).currentAccount;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_createForumTopic, new ck8((Object) this, (Object) obj, hdVar, (byte) 25));
            }
        } else if (i == 2) {
            if (vtbVar.e.getText() != null) {
                str = vtbVar.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) vtbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                gl.z3(vtbVar.e);
                return;
            }
            if (!vtbVar.x.title.equals(str) || vtbVar.x.icon_emoji_id != vtbVar.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = vtbVar.getMessagesController().h1(vtbVar.a);
                TLRPC.TL_forumTopic tL_forumTopic = vtbVar.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j2 = vtbVar.x.icon_emoji_id;
                long j3 = vtbVar.b;
                if (j2 != j3) {
                    tL_messages_editForumTopic.icon_emoji_id = j3;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i2 = ((d) vtbVar).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editForumTopic, new ce2((byte) 0));
            }
            if (vtbVar.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = vtbVar.x;
                if (tL_forumTopic2.id == 1 && (!zgbVar.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = vtbVar.getMessagesController().h1(vtbVar.a);
                    tL_messages_editForumTopic2.topic_id = vtbVar.x.id;
                    tL_messages_editForumTopic2.hidden = !vtbVar.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i3 = ((d) vtbVar).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_editForumTopic2, new ce2((byte) 0));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = vtbVar.x;
            long j4 = vtbVar.b;
            tL_forumTopic3.icon_emoji_id = j4;
            int i5 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            int i6 = tL_forumTopic3.flags;
            if (i5 != 0) {
                tL_forumTopic3.flags = i6 | 1;
            } else {
                tL_forumTopic3.flags = i6 & (-2);
            }
            tL_forumTopic3.title = str;
            if (vtbVar.d != null) {
                tL_forumTopic3.hidden = !zgbVar2.d.h;
            }
            pub pubVar = vtbVar.getMessagesController().g4;
            long j5 = vtbVar.a;
            pubVar.getMessagesStorage().c2(j5, vtbVar.x, 35);
            pubVar.y(-j5, true);
            vtbVar.finishFragment();
        }
    }
}
