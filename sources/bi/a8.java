package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class a8 extends TL_stories.StoryItem {
    public final b8 f2772a;

    public a8(b8 b8Var, long j3, TL_bots.botPreviewMedia botpreviewmedia) {
        this.f2772a = b8Var;
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
