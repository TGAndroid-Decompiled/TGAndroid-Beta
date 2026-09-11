package bi;

import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class o6 implements ToIntFunction {
    public final int f3484a;

    public o6(int i10) {
        this.f3484a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f3484a) {
            case 0:
                return -((TL_stories.StoryView) obj).date;
            case 1:
                return ((TL_stories.StoryItem) obj).date;
            case 2:
                return -((TL_stories.StoryItem) i2.g.h(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 3:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 4:
                return ((MessageObject) obj).getId();
            case 5:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 6:
                return ((TLRPC.Message) obj).f19890id;
            case 7:
                return ((TLRPC.Message) obj).f19890id;
            case 8:
                return ((org.telegram.ui.Components.f6) obj).d;
            case 9:
                return ((org.telegram.ui.Components.f6) obj).f25928e;
            case 10:
                ad.c cVar = (ad.c) obj;
                return cVar.d - cVar.f405b;
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
                return ((yf.d) obj).f50054a;
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
            default:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
        }
    }
}
