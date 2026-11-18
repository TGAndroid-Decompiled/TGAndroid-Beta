package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j3 implements RequestDelegate {
    public final int f24805a;
    public final int f24806b;
    public final long f24807c;
    public final Object d;
    public final Object f24808e;

    public j3(int i7, int i10, long j3, Object obj, Object obj2) {
        this.f24805a = i10;
        this.d = obj;
        this.f24806b = i7;
        this.f24808e = obj2;
        this.f24807c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        switch (this.f24805a) {
            case 0:
                k3 k3Var = (k3) this.d;
                fj fjVar = (fj) this.f24808e;
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
                    storyItem2.f28644id = this.f24806b;
                    g0.g3(new fm(k3Var, fjVar, this.f24807c, storyItem2, 2));
                    return;
                }
                return;
            case 1:
                g0.g3(new z1((ri) this.d, tLObject, this.f24806b, (x10) this.f24808e, this.f24807c));
                return;
            default:
                mp mpVar = (mp) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.f24808e;
                if (this.f24806b == mpVar.f25823z2) {
                    mpVar.f25814y2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        mpVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        mpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        g0.g3(new fm(mpVar, tL_help_promoData, tL_messages_peerDialogs, this.f24807c, 1));
                    } else {
                        g0.g3(new rj(mpVar, 22));
                    }
                    mpVar.f25804x2 = false;
                    return;
                }
                return;
        }
    }
}
