package ag;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i6;
public final class e implements ToIntFunction {
    public final int f1270a;

    public e(int i10) {
        this.f1270a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f1270a) {
            case 0:
                return ((i) obj).f1298a;
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
                return -((TL_stories.StoryItem) ic.a.g(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 11:
                return ((MessageObject) obj).getId();
            case 12:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 13:
                return ((TLRPC.Message) obj).f22049id;
            case 14:
                return ((TLRPC.Message) obj).f22049id;
            case 15:
                return ((i6) obj).d;
            case 16:
                return ((i6) obj).e;
            case 17:
                dd.c cVar = (dd.c) obj;
                return cVar.d - cVar.f8330b;
            case 18:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction.date;
                if (i10 > 0 && messagePeerReaction.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            case 19:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i11 = messagePeerReaction2.date;
                if (i11 > 0 && messagePeerReaction2.reaction == null) {
                    return -i11;
                }
                return Integer.MIN_VALUE;
            default:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
        }
    }
}
