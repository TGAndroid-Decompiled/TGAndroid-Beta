package hi;

import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class j6 implements ToIntFunction {
    public final int f9683a;

    public j6(int i10) {
        this.f9683a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f9683a) {
            case 0:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 1:
                return ((MessageObject) obj).getId();
            case 2:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 3:
                return ((TLRPC.Message) obj).f17216id;
            case 4:
                return ((TLRPC.Message) obj).f17216id;
            case 5:
                return ((org.telegram.ui.Components.e6) obj).d;
            case 6:
                return ((org.telegram.ui.Components.e6) obj).e;
            case 7:
                ad.c cVar = (ad.c) obj;
                return cVar.d - cVar.f386b;
            case 8:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                if (i10 > 0 && messagePeerReaction.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            case 9:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                if (i11 > 0 && messagePeerReaction2.reaction == null) {
                    return -i11;
                }
                return Integer.MIN_VALUE;
            case 10:
                return ((xf.d) obj).f45099a;
            case 11:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 12:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 13:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
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
                return -((TL_stories.StoryView) obj).date;
            case 18:
                return ((TL_stories.StoryItem) obj).date;
            default:
                return -((TL_stories.StoryItem) hc.b.i(1, ((TL_stories.PeerStories) obj).stories)).date;
        }
    }
}
