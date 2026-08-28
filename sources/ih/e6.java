package ih;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class e6 extends TL_stories.StoryItem {
    public final f6 f11366a;

    public e6(f6 f6Var, long j10, TL_bots.botPreviewMedia botpreviewmedia) {
        this.f11366a = f6Var;
        this.dialogId = j10;
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
