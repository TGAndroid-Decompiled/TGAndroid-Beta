package ff;

import java.util.function.ToIntFunction;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.z5;
public final class d implements ToIntFunction {
    public final int f6160a;

    public d(int i9) {
        this.f6160a = i9;
    }

    @Override
    public final int applyAsInt(Object obj) {
        switch (this.f6160a) {
            case 0:
                return ((g) obj).f6168a;
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
                return -((TL_stories.StoryItem) j3.r0.j(1, ((TL_stories.PeerStories) obj).stories)).date;
            case 10:
                return ((MessageObject) obj).getId();
            case 11:
                return -((TLRPC.TL_forumTopic) obj).top_message;
            case 12:
                return ((TLRPC.Message) obj).f22401id;
            case 13:
                return ((TLRPC.Message) obj).f22401id;
            case 14:
                return ((z5) obj).d;
            case 15:
                return ((z5) obj).f35196e;
            case 16:
                ic.c cVar = (ic.c) obj;
                return cVar.d - cVar.f11092b;
            case 17:
                TLRPC.MessagePeerReaction messagePeerReaction = (TLRPC.MessagePeerReaction) obj;
                int i9 = messagePeerReaction.date;
                if (i9 > 0 && messagePeerReaction.reaction == null) {
                    return -i9;
                }
                return Integer.MIN_VALUE;
            case 18:
                TLRPC.MessagePeerReaction messagePeerReaction2 = (TLRPC.MessagePeerReaction) obj;
                int i10 = messagePeerReaction2.date;
                if (i10 > 0 && messagePeerReaction2.reaction == null) {
                    return -i10;
                }
                return Integer.MIN_VALUE;
            default:
                return ((Integer) ((Object[]) obj)[1]).intValue();
        }
    }
}
