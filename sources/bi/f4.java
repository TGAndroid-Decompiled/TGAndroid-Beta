package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.ip;
public final class f4 implements Utilities.Callback {
    public final int f4600a = 0;
    public final int f4601b;
    public final long f4602c;
    public final Object d;

    public f4(int i10, long j10, TLRPC.Document document) {
        this.f4601b = i10;
        this.f4602c = j10;
        this.d = document;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f4600a;
        int i11 = this.f4601b;
        long j10 = this.f4602c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    ca.y(i11, false).Q(j10);
                    AndroidUtilities.runOnUIThread(new a3.l0(new j4(j10, 0), document, LocaleController.getString(R.string.Gift2MovedToProfile), 12));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i11 == 1) {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
                    } else if (i11 == 2) {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title));
                    } else {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
                    }
                } else {
                    string = LocaleController.getString(R.string.AddEmojiNotFound);
                }
                AndroidUtilities.runOnUIThread(new ip(7, qcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((aw0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
        }
    }

    public f4(int i10, org.telegram.ui.Components.qc qcVar, long j10) {
        this.f4601b = i10;
        this.d = qcVar;
        this.f4602c = j10;
    }

    public f4(aw0 aw0Var, long j10, int i10) {
        this.d = aw0Var;
        this.f4602c = j10;
        this.f4601b = i10;
    }
}
