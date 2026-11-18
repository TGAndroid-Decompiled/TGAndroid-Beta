package bg;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.fj;
import org.telegram.messenger.q9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.d6;
public final class d implements ToIntFunction {
    public final int f3213a;

    public d(int i7) {
        this.f3213a = i7;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f3213a) {
            case 0:
                return ((h) obj).f3236a;
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
                return -((TL_stories.StoryItem) i5.c.h(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((q9) obj).f26373e.bid_date;
            case 12:
                return Integer.parseInt((String) obj);
            case 13:
                return ((fj) obj).e1();
            case 14:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 15:
                return ((TLRPC.Message) obj).f28426id;
            case 16:
                return ((TLRPC.Message) obj).f28426id;
            case 17:
                return ((d6) obj).d;
            case 18:
                return ((d6) obj).f34284e;
            case 19:
                ad.c cVar = (ad.c) obj;
                return cVar.d - cVar.f1033b;
            case 20:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i7 = messagePeerReaction.date;
                if (i7 > 0 && messagePeerReaction.reaction == null) {
                    return -i7;
                }
                return Integer.MIN_VALUE;
            case 21:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction2.date;
                if (i10 > 0 && messagePeerReaction2.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            default:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
        }
    }
}
