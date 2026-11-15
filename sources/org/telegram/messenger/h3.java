package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 implements RequestDelegate {
    public final int f24049a;
    public final int f24050b;
    public final long f24051c;
    public final Object d;
    public final Object f24052e;

    public h3(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f24049a = i10;
        this.d = obj;
        this.f24050b = i7;
        this.f24052e = obj2;
        this.f24051c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        switch (this.f24049a) {
            case 0:
                i3 i3Var = (i3) this.d;
                gj gjVar = (gj) this.f24052e;
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
                    storyItem2.f28290id = this.f24050b;
                    g0.h3(new gm(i3Var, gjVar, this.f24051c, storyItem2, 2));
                    return;
                }
                return;
            case 1:
                g0.h3(new z1((si) this.d, tLObject, this.f24050b, (z10) this.f24052e, this.f24051c));
                return;
            default:
                np npVar = (np) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.f24052e;
                if (this.f24050b == npVar.f25433x2) {
                    npVar.f25423w2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        npVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        npVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        g0.h3(new gm(npVar, tL_help_promoData, tL_messages_peerDialogs, this.f24051c, 1));
                    } else {
                        g0.h3(new tj(npVar, 24));
                    }
                    npVar.f25413v2 = false;
                    return;
                }
                return;
        }
    }
}
