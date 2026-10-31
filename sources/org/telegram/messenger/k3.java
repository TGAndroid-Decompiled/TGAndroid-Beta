package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k3 implements RequestDelegate {
    public final int f16520a;
    public final int f16521b;
    public final long f16522c;
    public final Object d;
    public final Object e;

    public k3(int i10, int i11, long j10, Object obj, Object obj2) {
        this.f16520a = i11;
        this.d = obj;
        this.f16521b = i10;
        this.e = obj2;
        this.f16522c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stories.StoryItem storyItem;
        switch (this.f16520a) {
            case 0:
                l3 l3Var = (l3) this.d;
                jj jjVar = (jj) this.e;
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
                    storyItem2.f20031id = this.f16521b;
                    i0.g3(new wm(l3Var, jjVar, this.f16522c, storyItem2, 2));
                    return;
                }
                return;
            case 1:
                i0.g3(new d2((ui) this.d, tLObject, this.f16521b, (q20) this.e, this.f16522c));
                return;
            default:
                vp vpVar = (vp) this.d;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.e;
                if (this.f16521b == vpVar.f18933w2) {
                    vpVar.f18923v2 = 0;
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (tL_messages_peerDialogs != null && !tL_messages_peerDialogs.dialogs.isEmpty()) {
                        vpVar.getMessagesStorage().m1(tL_help_promoData.users, tL_help_promoData.chats, true, true);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.chats = tL_messages_peerDialogs.chats;
                        tL_messages_dialogs.users = tL_messages_peerDialogs.users;
                        tL_messages_dialogs.dialogs = tL_messages_peerDialogs.dialogs;
                        tL_messages_dialogs.messages = tL_messages_peerDialogs.messages;
                        vpVar.getMessagesStorage().d1(tL_messages_dialogs, 2);
                        i0.g3(new wm(vpVar, tL_help_promoData, tL_messages_peerDialogs, this.f16522c, 1));
                    } else {
                        i0.g3(new zj(vpVar, 21));
                    }
                    vpVar.f18914u2 = false;
                    return;
                }
                return;
        }
    }
}
