package bg;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.ij;
import org.telegram.messenger.s9;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.x5;
public final class d implements ToIntFunction {
    public final int f3266a;

    public d(int i7) {
        this.f3266a = i7;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f3266a) {
            case 0:
                return ((h) obj).f3287a;
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
                return -((TL_stories.StoryItem) jg.g.i(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((s9) obj).f25437e.bid_date;
            case 12:
                return Integer.parseInt((String) obj);
            case 13:
                return ((ij) obj).f1();
            case 14:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 15:
                return ((TLRPC.Message) obj).f26977id;
            case 16:
                return ((TLRPC.Message) obj).f26977id;
            case 17:
                return ((x5) obj).d;
            case 18:
                return ((x5) obj).f40211e;
            case 19:
                ad.c cVar = (ad.c) obj;
                return cVar.d - cVar.f1036b;
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
