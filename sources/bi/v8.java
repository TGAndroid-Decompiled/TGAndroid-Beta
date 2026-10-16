package bi;

import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Utilities.Callback {
    public final int f3881a;
    public final w8 f3882b;

    public v8(w8 w8Var, int i10) {
        this.f3881a = i10;
        this.f3882b = w8Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f3881a) {
            case 0:
                w8 w8Var = this.f3882b;
                di.k8 k8Var = w8Var.f3919c;
                k8Var.f7182c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(k8Var.f7182c0);
                w8Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                w8 w8Var2 = this.f3882b;
                w8Var2.F = videoEditedInfo;
                w8Var2.E.videoEditedInfo = videoEditedInfo;
                w8Var2.f3926y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(w8Var2.E, false, false, false);
                    return;
                } else if (new File(w8Var2.E.videoEditedInfo.originalPath).renameTo(new File(w8Var2.e))) {
                    FileLoader.getInstance(w8Var2.M.f3966a).uploadFile(w8Var2.e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
