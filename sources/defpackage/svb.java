package defpackage;

import android.os.Vibrator;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.d;
public final class svb extends c6 {
    public final wvb a;

    public svb(wvb wvbVar) {
        this.a = wvbVar;
    }

    @Override
    public final void b(int i) {
        int i2;
        ajb ajbVar;
        ajb ajbVar2;
        int i3;
        String obj;
        int i4;
        wvb wvbVar = this.a;
        if (i == -1) {
            wvbVar.finishFragment();
            return;
        }
        String str = null;
        if (i == 1) {
            if (wvbVar.e.getText() == null) {
                obj = null;
            } else {
                obj = wvbVar.e.getText().toString();
            }
            if (TextUtils.isEmpty(obj)) {
                Vibrator vibrator = (Vibrator) wvbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator != null) {
                    vibrator.vibrate(200L);
                }
                gm.z3(wvbVar.e);
            } else if (!wvbVar.r) {
                he heVar = new he(3, null, wvbVar.getParentActivity());
                heVar.q(500L);
                wvbVar.r = true;
                TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                tL_messages_createForumTopic.peer = wvbVar.getMessagesController().i1(wvbVar.a);
                tL_messages_createForumTopic.title = obj;
                long j = wvbVar.b;
                if (j != 0) {
                    tL_messages_createForumTopic.icon_emoji_id = j;
                    tL_messages_createForumTopic.flags |= 8;
                }
                tL_messages_createForumTopic.random_id = Utilities.b.nextLong();
                tL_messages_createForumTopic.icon_color = wvbVar.F;
                tL_messages_createForumTopic.flags |= 1;
                i4 = ((d) wvbVar).currentAccount;
                ConnectionsManager.getInstance(i4).sendRequest(tL_messages_createForumTopic, new fm8((Object) this, (Object) obj, heVar, (byte) 25));
            }
        } else if (i == 2) {
            if (wvbVar.e.getText() != null) {
                str = wvbVar.e.getText().toString();
            }
            if (TextUtils.isEmpty(str)) {
                Vibrator vibrator2 = (Vibrator) wvbVar.getParentActivity().getSystemService("vibrator");
                if (vibrator2 != null) {
                    vibrator2.vibrate(200L);
                }
                gm.z3(wvbVar.e);
                return;
            }
            if (!wvbVar.x.title.equals(str) || wvbVar.x.icon_emoji_id != wvbVar.b) {
                TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic = new TL_forum.TL_messages_editForumTopic();
                tL_messages_editForumTopic.peer = wvbVar.getMessagesController().i1(wvbVar.a);
                TLRPC.TL_forumTopic tL_forumTopic = wvbVar.x;
                tL_messages_editForumTopic.topic_id = tL_forumTopic.id;
                if (!tL_forumTopic.title.equals(str)) {
                    tL_messages_editForumTopic.title = str;
                    tL_messages_editForumTopic.flags |= 1;
                }
                long j2 = wvbVar.x.icon_emoji_id;
                long j3 = wvbVar.b;
                if (j2 != j3) {
                    tL_messages_editForumTopic.icon_emoji_id = j3;
                    tL_messages_editForumTopic.flags |= 2;
                }
                i2 = ((d) wvbVar).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editForumTopic, new nf2((byte) 0));
            }
            if (wvbVar.d != null) {
                TLRPC.TL_forumTopic tL_forumTopic2 = wvbVar.x;
                if (tL_forumTopic2.id == 1 && (!ajbVar.d.h) != tL_forumTopic2.hidden) {
                    TL_forum.TL_messages_editForumTopic tL_messages_editForumTopic2 = new TL_forum.TL_messages_editForumTopic();
                    tL_messages_editForumTopic2.peer = wvbVar.getMessagesController().i1(wvbVar.a);
                    tL_messages_editForumTopic2.topic_id = wvbVar.x.id;
                    tL_messages_editForumTopic2.hidden = !wvbVar.d.d.h;
                    tL_messages_editForumTopic2.flags |= 8;
                    i3 = ((d) wvbVar).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_editForumTopic2, new nf2((byte) 0));
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic3 = wvbVar.x;
            long j4 = wvbVar.b;
            tL_forumTopic3.icon_emoji_id = j4;
            int i5 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            int i6 = tL_forumTopic3.flags;
            if (i5 != 0) {
                tL_forumTopic3.flags = i6 | 1;
            } else {
                tL_forumTopic3.flags = i6 & (-2);
            }
            tL_forumTopic3.title = str;
            if (wvbVar.d != null) {
                tL_forumTopic3.hidden = !ajbVar2.d.h;
            }
            qwb qwbVar = wvbVar.getMessagesController().g4;
            long j5 = wvbVar.a;
            qwbVar.getMessagesStorage().c2(j5, wvbVar.x, 35);
            qwbVar.y(-j5, true);
            wvbVar.finishFragment();
        }
    }
}
