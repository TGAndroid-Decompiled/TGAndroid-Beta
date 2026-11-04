package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h3 implements RequestDelegate {
    public final int f22879a;
    public final int f22880b;
    public final long f22881c;
    public final Object d;
    public final Object f22882e;

    public h3(int i3, int i10, long j10, Object obj, Object obj2) {
        this.f22879a = i10;
        this.d = obj;
        this.f22880b = i3;
        this.f22882e = obj2;
        this.f22881c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        switch (this.f22879a) {
            case 0:
                i3 i3Var = (i3) this.d;
                zi ziVar = (zi) this.f22882e;
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
                    storyItem2.f27240id = this.f22880b;
                    g0.h3(new zl(i3Var, ziVar, this.f22881c, storyItem2, 2));
                    return;
                }
                return;
            case 1:
                g0.h3(new z1((li) this.d, tLObject, this.f22880b, (u10) this.f22882e, this.f22881c));
                return;
            default:
                hp hpVar = (hp) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.f22882e;
                if (this.f22880b == hpVar.f23162x2) {
                    hpVar.f23152w2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        hpVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        hpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        g0.h3(new zl(hpVar, tL_help_promoData, tL_messages_peerDialogs, this.f22881c, 1));
                    } else {
                        g0.h3(new mj(hpVar, 23));
                    }
                    hpVar.f23142v2 = false;
                    return;
                }
                return;
        }
    }
}
