package defpackage;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class mn implements ToIntFunction {
    public final byte a;

    public mn(byte b) {
        this.a = b;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.a) {
            case 0:
                return ((nn) obj).d;
            case 1:
                return ((nn) obj).e;
            case 2:
                return ((cl0) obj).a;
            case 3:
                return ((k47) obj).e1();
            case 4:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 5:
                return ((hv4) obj).e.bid_date;
            case 6:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            case 7:
                gi5 gi5Var = (gi5) obj;
                return gi5Var.d - gi5Var.b;
            case 8:
                return Integer.parseInt((String) obj);
            case 9:
                return ((TLRPC.Message) obj).id;
            case 10:
                return ((TLRPC.Message) obj).id;
            case 11:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i = messagePeerReaction.date;
                if (i <= 0 || messagePeerReaction.reaction != null) {
                    return Integer.MIN_VALUE;
                }
                return -i;
            case 12:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i2 = messagePeerReaction2.date;
                if (i2 <= 0 || messagePeerReaction2.reaction != null) {
                    return Integer.MIN_VALUE;
                }
                return -i2;
            case 13:
                return -((TL_stories.StoryView) obj).date;
            case 14:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 15:
                if (!((TL_stars.StarGift) obj).birthday) {
                    return 0;
                }
                return -1;
            case 16:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 17:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 18:
                if (!((TL_stars.StarGift) obj).birthday) {
                    return 0;
                }
                return -1;
            case 19:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 20:
                return ((TL_stories.StoryItem) obj).date;
            case 21:
                return -((TL_stories.StoryItem) b10.f(1, ((TL_stories.PeerStories) obj).stories)).date;
            default:
                return ((Integer) ((Object[]) obj)[1]).intValue();
        }
    }
}
