package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.gh;
public final class e4 implements Utilities.Callback {
    public final int f1203a = 0;
    public final int f1204b;
    public final long f1205c;
    public final Object d;

    public e4(int i10, long j10, TLRPC.Document document) {
        this.f1204b = i10;
        this.f1205c = j10;
        this.d = document;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f1203a;
        int i11 = this.f1204b;
        long j10 = this.f1205c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (((Boolean) obj).booleanValue()) {
                    fa.y(i11, false).Q(j10);
                    AndroidUtilities.runOnUIThread(new a3.l0(document, LocaleController.getString(R.string.Gift2MovedToProfile), new o4(j10, 0), 8));
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
                AndroidUtilities.runOnUIThread(new gh(26, qcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((sv0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
        }
    }

    public e4(int i10, org.telegram.ui.Components.qc qcVar, long j10) {
        this.f1204b = i10;
        this.d = qcVar;
        this.f1205c = j10;
    }

    public e4(sv0 sv0Var, long j10, int i10) {
        this.d = sv0Var;
        this.f1205c = j10;
        this.f1204b = i10;
    }
}
