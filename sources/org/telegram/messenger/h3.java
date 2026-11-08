package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 implements RequestDelegate {
    public final int f22836a;
    public final int f22837b;
    public final long f22838c;
    public final Object d;
    public final Object f22839e;

    public h3(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f22836a = i10;
        this.d = obj;
        this.f22837b = i7;
        this.f22839e = obj2;
        this.f22838c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        switch (this.f22836a) {
            case 0:
                i3 i3Var = (i3) this.d;
                ij ijVar = (ij) this.f22839e;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    if (tL_stories_stories.stories.size() > 0) {
                        storyItem = tL_stories_stories.stories.get(0);
                    } else {
                        storyItem = null;
                    }
                    if (storyItem == null) {
                        storyItem = new TL_stories.TL_storyItemDeleted();
                    }
                    TL_stories.StoryItem storyItem2 = storyItem;
                    storyItem2.lastUpdateTime = System.currentTimeMillis();
                    storyItem2.f27195id = this.f22837b;
                    g0.h3(new jm(i3Var, ijVar, this.f22838c, storyItem2, 2));
                    return;
                }
                return;
            case 1:
                g0.h3(new z1((ui) this.d, tLObject, this.f22837b, (c20) this.f22839e, this.f22838c));
                return;
            default:
                qp qpVar = (qp) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.f22839e;
                if (this.f22837b == qpVar.f24927w2) {
                    qpVar.f24917v2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        qpVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        qpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        g0.h3(new jm(qpVar, tL_help_promoData, tL_messages_peerDialogs, this.f22838c, 1));
                    } else {
                        g0.h3(new vj(qpVar, 24));
                    }
                    qpVar.f24908u2 = false;
                    return;
                }
                return;
        }
    }
}
