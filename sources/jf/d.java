package jf;

import j7.l1;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.e6;
public final class d implements ToIntFunction {
    public final int f11578a;

    public d(int i10) {
        this.f11578a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f11578a) {
            case 0:
                return ((f) obj).f11582a;
            case 1:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 2:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 3:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 4:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 5:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 6:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 7:
                return -((TL_stories.StoryView) obj).date;
            case 8:
                return ((TL_stories.StoryItem) obj).date;
            case 9:
                return -((TL_stories.StoryItem) l1.i(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((MessageObject) obj).getId();
            case 11:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 12:
                return ((TLRPC.Message) obj).f22413id;
            case 13:
                return ((TLRPC.Message) obj).f22413id;
            case 14:
                return ((e6) obj).d;
            case 15:
                return ((e6) obj).f27935e;
            case 16:
                kc.c cVar = (kc.c) obj;
                return cVar.d - cVar.f13615b;
            case 17:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                if (i10 > 0 && messagePeerReaction.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            case 18:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                if (i11 > 0 && messagePeerReaction2.reaction == null) {
                    return -i11;
                }
                return Integer.MIN_VALUE;
            default:
                return ((Integer) ((Object[]) obj)[1]).intValue();
        }
    }
}
