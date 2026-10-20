package ai;

import java.util.Map;
import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class v8 implements ToIntFunction {
    public final int f2316a;

    public v8(int i10) {
        this.f2316a = i10;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f2316a) {
            case 0:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 1:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 2:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 3:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 4:
                if (((TL_stars.StarGift) obj).birthday) {
                    return -1;
                }
                return 0;
            case 5:
                return ((TL_stars.StarGift) obj).sold_out ? 1 : 0;
            case 6:
                return -((TL_stories.StoryView) obj).date;
            case 7:
                return ((TL_stories.StoryItem) obj).date;
            case 8:
                return -((TL_stories.StoryItem) i2.e.h(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 9:
                return ((Integer) ((Object[]) obj)[1]).intValue();
            case 10:
                return ((MessageObject) obj).getId();
            case 11:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 12:
                return ((TLRPC.Message) obj).f20297id;
            case 13:
                return ((TLRPC.Message) obj).f20297id;
            case 14:
                return ((org.telegram.ui.Components.g6) obj).d;
            case 15:
                return ((org.telegram.ui.Components.g6) obj).e;
            case 16:
                cd.c cVar = (cd.c) obj;
                return cVar.d - cVar.f5102b;
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
            case 19:
                return ((String) ((Map.Entry) obj).getKey()).hashCode();
            default:
                return ((zf.d) obj).f51536a;
        }
    }
}
