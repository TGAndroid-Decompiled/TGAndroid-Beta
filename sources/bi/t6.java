package bi;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.kj;
import org.telegram.messenger.u9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class t6 implements ToIntFunction {
    public final int f3368a;

    public t6(int i10) {
        this.f3368a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f3368a) {
            case 0:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 1:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 2:
                return ((u9) obj).e.bid_date;
            case 3:
                return Integer.parseInt((String) obj);
            case 4:
                return ((kj) obj).f1();
            case 5:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 6:
                return ((TLRPC.Message) obj).f19815id;
            case 7:
                return ((TLRPC.Message) obj).f19815id;
            case 8:
                return ((org.telegram.ui.Components.u5) obj).d;
            case 9:
                return ((org.telegram.ui.Components.u5) obj).e;
            case 10:
                uc.c cVar = (uc.c) obj;
                return cVar.d - cVar.f50226b;
            case 11:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                if (i10 > 0 && messagePeerReaction.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                if (i11 > 0 && messagePeerReaction2.reaction == null) {
                    return -i11;
                }
                return Integer.MIN_VALUE;
            case 13:
                return ((rf.d) obj).f46509a;
            case 14:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 15:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 16:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 17:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 18:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 19:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 20:
                return -((TL_stories.StoryView) obj).date;
            case 21:
                return ((TL_stories.StoryItem) obj).date;
            default:
                return -((TL_stories.StoryItem) i0.a.g(1, ((TL_stories.PeerStories) obj).stories)).date;
        }
    }
}
