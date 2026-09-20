package ai;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class j9 implements Utilities.Callback {
    public final int f1060a;
    public final k9 f1061b;

    public j9(k9 k9Var, int i10) {
        this.f1060a = i10;
        this.f1061b = k9Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f1060a) {
            case 0:
                k9 k9Var = this.f1061b;
                ci.o8 o8Var = k9Var.f1143c;
                o8Var.f5150c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(o8Var.f5150c0);
                k9Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                k9 k9Var2 = this.f1061b;
                k9Var2.F = videoEditedInfo;
                k9Var2.E.videoEditedInfo = videoEditedInfo;
                k9Var2.f1150y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(k9Var2.E, false, false, false);
                    return;
                } else if (new File(k9Var2.E.videoEditedInfo.originalPath).renameTo(new File(k9Var2.e))) {
                    FileLoader.getInstance(k9Var2.M.f1193a).uploadFile(k9Var2.e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
