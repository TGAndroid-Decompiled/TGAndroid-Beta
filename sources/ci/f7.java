package ci;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class f7 implements Utilities.Callback {
    public final int f5323a;
    public final g7 f5324b;

    public f7(g7 g7Var, int i10) {
        this.f5323a = i10;
        this.f5324b = g7Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f5323a) {
            case 0:
                g7 g7Var = this.f5324b;
                ei.a8 a8Var = g7Var.f5364c;
                a8Var.f8702c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(a8Var.f8702c0);
                g7Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                g7 g7Var2 = this.f5324b;
                g7Var2.F = videoEditedInfo;
                g7Var2.E.videoEditedInfo = videoEditedInfo;
                g7Var2.f5371y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(g7Var2.E, false, false, false);
                    return;
                } else if (new File(g7Var2.E.videoEditedInfo.originalPath).renameTo(new File(g7Var2.e))) {
                    FileLoader.getInstance(g7Var2.M.f5397a).uploadFile(g7Var2.e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
