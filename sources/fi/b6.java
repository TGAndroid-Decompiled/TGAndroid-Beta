package fi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class b6 extends TL_stories.StoryItem {
    public final c6 f11567a;

    public b6(c6 c6Var, long j3, TL_bots.botPreviewMedia botpreviewmedia) {
        this.f11567a = c6Var;
        this.dialogId = j3;
        TLRPC.MessageMedia messageMedia = botpreviewmedia.media;
        this.media = messageMedia;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            document.date = botpreviewmedia.date;
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null) {
            photo.date = botpreviewmedia.date;
        }
    }
}
