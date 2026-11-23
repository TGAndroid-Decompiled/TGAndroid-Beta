package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j3 implements RequestDelegate {
    public final int f24822a;
    public final int f24823b;
    public final long f24824c;
    public final Object d;
    public final Object f24825e;

    public j3(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f24822a = i10;
        this.d = obj;
        this.f24823b = i7;
        this.f24825e = obj2;
        this.f24824c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        switch (this.f24822a) {
            case 0:
                k3 k3Var = (k3) this.d;
                gj gjVar = (gj) this.f24825e;
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
                    storyItem2.f28673id = this.f24823b;
                    g0.g3(new gm(k3Var, gjVar, this.f24824c, storyItem2, 2));
                    return;
                }
                return;
            case 1:
                g0.g3(new z1((si) this.d, tLObject, this.f24823b, (y10) this.f24825e, this.f24824c));
                return;
            default:
                np npVar = (np) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.f24825e;
                if (this.f24823b == npVar.f26020z2) {
                    npVar.f26011y2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        npVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        npVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        g0.g3(new gm(npVar, tL_help_promoData, tL_messages_peerDialogs, this.f24824c, 1));
                    } else {
                        g0.g3(new sj(npVar, 22));
                    }
                    npVar.f26001x2 = false;
                    return;
                }
                return;
        }
    }
}
