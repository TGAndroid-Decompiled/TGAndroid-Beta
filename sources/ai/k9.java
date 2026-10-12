package ai;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k9 implements Utilities.Callback {
    public final int f1244a;
    public final l9 f1245b;

    public k9(l9 l9Var, int i10) {
        this.f1244a = i10;
        this.f1245b = l9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1244a) {
            case 0:
                l9 l9Var = this.f1245b;
                ci.l8 l8Var = l9Var.f1349c;
                l8Var.f5399c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(l8Var.f5399c0);
                l9Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                l9 l9Var2 = this.f1245b;
                l9Var2.F = videoEditedInfo;
                l9Var2.E.videoEditedInfo = videoEditedInfo;
                l9Var2.f1357y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(l9Var2.E, false, false, false);
                    return;
                } else if (new File(l9Var2.E.videoEditedInfo.originalPath).renameTo(new File(l9Var2.f1350e))) {
                    FileLoader.getInstance(l9Var2.M.f1404a).uploadFile(l9Var2.f1350e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
