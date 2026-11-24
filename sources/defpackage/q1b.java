package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class q1b extends TL_stories.StoryItem {
    public final s1b a;

    public q1b(s1b s1bVar, long j, TL_bots.botPreviewMedia botpreviewmedia) {
        this.a = s1bVar;
        this.dialogId = j;
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
